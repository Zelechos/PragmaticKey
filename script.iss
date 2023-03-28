;******************************************************************************************************************************************
; [Setup]: Es la parte en donde se configura la aplicación.
;******************************************************************************************************************************************
[Setup]
;AppName:
;Esta directiva especifica el nombre de la aplicación que se esta instalando
;Se muestra en todo el programa de Instalación y el desinstalador
;en los títulos de las ventanas, las páginas del asistente y los cuadros de diálogo
AppName=App Mantenimiento

;AppVerName: Esta directiva especifica el nombre de la aplicación más su número de versión
;El valor de esta directiva se muestra en la página de bienvenida del asistente de instalación
;Y se usa como título predeterminado de la entrada "Agregar o quitar programas" de la aplicación
;Esta directiva es necesaria si no se establece la directiva AppVersion
;AppVerName=AlmacenDeDocumentos-AppVerName

;DefaultGroupName
;Se utiliza para el nombre de la carpeta en la parte Seleccionar carpeta cuando se inicia la instalación
DefaultGroupName=AppMantenimiento

;AppPublisher y AppPublisherURL
;Esta cadena se muestra en el cuadro de dialogo "soporte" en agregar o quitar programas
;del panel de control.
AppPublisher=My empresa, S.A.C
AppPublisherURL= http://www.miempresa.com

;AppVersion:
;Esta directiva especifica el número de versión de la aplicación que se está instalando
;Es obligatorio sino se establece AppVerName 
AppVersion=1.0

;AllowNoIcons:
;Cuando se establece yes el programa de instalación mostrara una casilla de verificación
;No crear una carpeta del menú Inicio.
;Permite al usuario omitir la creación de accesos directos a programas en el menú inicio (yes or no)
AllowNoIcons=no

;AppCopyright:
;Especifica un mensaje de copyright que el programa de instalación mostrará en la 
;esquina inferior derecha de la ventana de la instalación WindowVisible debe ser yes (yes or no)
;Se utiliza si VersionInfoCopyright no se especifica
AppCopyright= Copyright ® 2020-2021 My empresa, S.A.C
;WindowVisible= yes

;PrivilegesRequired:
;admin, or lowest
;La instalación se ejecuta con derechos administrativos
PrivilegesRequired=admin

;Este es el nombre del archivo exe que se va a generar
OutputBaseFilename=SetupMantenimiento

; Este es el nombre de la carpeta en la cual se guardarán los archivos para el programa
; (Por lo general es el mismo nombre de la aplicación)
DefaultDirName={autopf}\AppMantenimiento

;OTROS: Poner un nombre personalizado en agregar o quitar programas
;UninstallDisplayName=Mi Programa unistall

;OTROS: Si se establece en sí no muestra la página de bienvenida (yes or no) por defcto yes
;DisableWelcomePage = yes 

;UninstallDisplayIcon={app}\Folder.exe 
UninstallDisplayIcon={app}\Iconos\unistall.ico
UninstallDisplayName=Desinstalar AppMantenimiento

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Languages] y [Tasks]: No tocar o modificar las siguientes líneas
;******************************************************************************************************************************************
; [Languages] = Es el lenguaje por defecto
; [Tasks]     = Es la indicación para crear los íconos necesarios para iniciar el programa y para desinstalarlo
[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: desktopicon; Description: Create a & desktop icon; GroupDescription: Additional icons:

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Files]: Son los archivos que utilizaremos para crear el instalador
;******************************************************************************************************************************************
[Files]

; Nota: Los parámetros: Tienen que ir tal y como aparecen acá, solo cambiar las rutas C:\ en donde se encuentran los archivos
;       Otra cosa: {sys} = carpeta system de windows
;                  {win} = carpeta windows de windows
;                  {cf}  = carpeta archivos comunes de windows
;                  {tmp} = carpeta temporal de windows
;                  {app} = carpeta donde se va a instalar el programa (fue definida arriba en el parámetro: DefaultDirName= )
; -----------------------------------------------------------------------------------------------------------------------------------------
; Aquí van los archivos de la aplicación: El .exe y otros que ocupe el programa la aplicación
Source: E:\CREAR INSTALADOR CON INNO SETUP\Archivos\Mantenimiento.exe; DestDir: {app}; Flags: ignoreversion
Source: E:\CREAR INSTALADOR CON INNO SETUP\Archivos\*; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: E:\CREAR INSTALADOR CON INNO SETUP\Script\complementos\script.sql*; DestDir: {tmp}; Flags : ignoreversion deleteafterinstall

;******************************************************************************************************************************************


; Omitir esta linea [INI] - No tocar o modificar la siguiente línea
[INI]


;******************************************************************************************************************************************
; [Icons]: Estos son los íconos que el instalador creara en el grupo de programas del sistema de Windows
;******************************************************************************************************************************************
[Icons]

; Nota: Aquí se incluye: El ícono para abrir el programa
;                        El ícono para desinstalar el programa
;                        El ícono que se ubica en el escritorio
; -----------------------------------------------------------------------------------------------------------------------------------------
; {group} = nombre del grupo de programa que se definió arriba en el parámetro: DefaultGroupName=
;           (Por lo general es el mismo nombre de la aplicación)
;Name: {group}\AlmacenDeDocumentos; Filename: {app}\folder.exe; WorkingDir: {app}; IconIndex: 0
;Name: {group}\Desinstalar AlmacenDeDocumentos; Filename: {uninstallexe}
;Name: {userdesktop}\AlmacenDeDocumentos; Filename: {app}\folder.exe; Tasks: desktopicon; WorkingDir: {app}; IconIndex: 0

Name: {group}\AppMantenimiento; Filename: {app}\Mantenimiento.exe; WorkingDir: {app}; IconFilename: {app}\Iconos\icono.ico; Comment: "Ejecutable"; 
Name: {commondesktop}\AppMantenimiento; Filename: {app}\Mantenimiento.exe; WorkingDir: {app}; IconFilename: {app}\Iconos\icono.ico; Comment: "Ejecutable escritorio";
Name: {group}\Desinstalar; Filename: {uninstallexe}; WorkingDir: {app}; IconFilename: {app}\Iconos\unistall.ico; Comment: "Unistaller";




;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Run]: Estos son los programas que se instalar como complementos de nuestra aplicación
;******************************************************************************************************************************************
[Run]

; Nota: Esto se ejecuta al momento de la instalación de nuestro programa

; Instalamos MySQL
; (Aquí tenemos que poner el nombre de nuestro motor de base de datos que se encuentra en nuestra carpeta complementos)
Filename: {src}\complementos\wampserver.exe; Parameters: "/q:a /C:""install /q"""; WorkingDir: {src}\complementos;

; Esto nos permite crear la base de datos
; (Aquí ponemos el nombre de nuestra base de datos y cambiamos nuestra ruta  C:\ si es necesario)
Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -h localhost -e ""create database josep CHARACTER SET 'utf8' COLLATE utf8_spanish_ci";  WorkingDir: {tmp}; StatusMsg: Creando la Base dedatos; Flags: runhidden

; Cargamos la base de datos
; (Acedemos a nuestra base de datos, cargamos nuestras tablas coon nuestro arcchivo [.sql] y cambiamos nuestra ruta  C:\ si es necesario)
Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -h localhost -e ""use josep; source script.sql;";  WorkingDir: {tmp}; StatusMsg: Creando Tablas; Flags: runhidden

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Messages]: Estos mensajes simplemente son un override ya que vienen en inglés
;             (Cambia los valores de las etiquetas para que aparezcan con el nombre de tu aplicación)
;******************************************************************************************************************************************
[Messages]

; Este es el título que se mostrara al momento de iniciar el cuadro de dialogo de la instalación (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel1=Instalación de AppMantenimiento

; Este es eñ titulo que se mostrara debajo del titulo (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel2=Este proceso instalará AppMantenimiento.%n%nSe recomienda cerrar todas las aplicaciones abiertas%nantes de continuar.

;******************************************************************************************************************************************