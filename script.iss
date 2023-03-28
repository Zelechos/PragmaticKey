;******************************************************************************************************************************************
; [Setup]: Es la parte en donde se configura la aplicaci�n.
;******************************************************************************************************************************************
[Setup]
;AppName:
;Esta directiva especifica el nombre de la aplicaci�n que se esta instalando
;Se muestra en todo el programa de Instalaci�n y el desinstalador
;en los t�tulos de las ventanas, las p�ginas del asistente y los cuadros de di�logo
AppName=App Mantenimiento

;AppVerName: Esta directiva especifica el nombre de la aplicaci�n m�s su n�mero de versi�n
;El valor de esta directiva se muestra en la p�gina de bienvenida del asistente de instalaci�n
;Y se usa como t�tulo predeterminado de la entrada "Agregar o quitar programas" de la aplicaci�n
;Esta directiva es necesaria si no se establece la directiva AppVersion
;AppVerName=AlmacenDeDocumentos-AppVerName

;DefaultGroupName
;Se utiliza para el nombre de la carpeta en la parte Seleccionar carpeta cuando se inicia la instalaci�n
DefaultGroupName=AppMantenimiento

;AppPublisher y AppPublisherURL
;Esta cadena se muestra en el cuadro de dialogo "soporte" en agregar o quitar programas
;del panel de control.
AppPublisher=My empresa, S.A.C
AppPublisherURL= http://www.miempresa.com

;AppVersion:
;Esta directiva especifica el n�mero de versi�n de la aplicaci�n que se est� instalando
;Es obligatorio sino se establece AppVerName 
AppVersion=1.0

;AllowNoIcons:
;Cuando se establece yes el programa de instalaci�n mostrara una casilla de verificaci�n
;No crear una carpeta del men� Inicio.
;Permite al usuario omitir la creaci�n de accesos directos a programas en el men� inicio (yes or no)
AllowNoIcons=no

;AppCopyright:
;Especifica un mensaje de copyright que el programa de instalaci�n mostrar� en la 
;esquina inferior derecha de la ventana de la instalaci�n WindowVisible debe ser yes (yes or no)
;Se utiliza si VersionInfoCopyright no se especifica
AppCopyright= Copyright � 2020-2021 My empresa, S.A.C
;WindowVisible= yes

;PrivilegesRequired:
;admin, or lowest
;La instalaci�n se ejecuta con derechos administrativos
PrivilegesRequired=admin

;Este es el nombre del archivo exe que se va a generar
OutputBaseFilename=SetupMantenimiento

; Este es el nombre de la carpeta en la cual se guardar�n los archivos para el programa
; (Por lo general es el mismo nombre de la aplicaci�n)
DefaultDirName={autopf}\AppMantenimiento

;OTROS: Poner un nombre personalizado en agregar o quitar programas
;UninstallDisplayName=Mi Programa unistall

;OTROS: Si se establece en s� no muestra la p�gina de bienvenida (yes or no) por defcto yes
;DisableWelcomePage = yes 

;UninstallDisplayIcon={app}\Folder.exe 
UninstallDisplayIcon={app}\Iconos\unistall.ico
UninstallDisplayName=Desinstalar AppMantenimiento

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Languages] y [Tasks]: No tocar o modificar las siguientes l�neas
;******************************************************************************************************************************************
; [Languages] = Es el lenguaje por defecto
; [Tasks]     = Es la indicaci�n para crear los �conos necesarios para iniciar el programa y para desinstalarlo
[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: desktopicon; Description: Create a & desktop icon; GroupDescription: Additional icons:

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Files]: Son los archivos que utilizaremos para crear el instalador
;******************************************************************************************************************************************
[Files]

; Nota: Los par�metros: Tienen que ir tal y como aparecen ac�, solo cambiar las rutas C:\ en donde se encuentran los archivos
;       Otra cosa: {sys} = carpeta system de windows
;                  {win} = carpeta windows de windows
;                  {cf}  = carpeta archivos comunes de windows
;                  {tmp} = carpeta temporal de windows
;                  {app} = carpeta donde se va a instalar el programa (fue definida arriba en el par�metro: DefaultDirName= )
; -----------------------------------------------------------------------------------------------------------------------------------------
; Aqu� van los archivos de la aplicaci�n: El .exe y otros que ocupe el programa la aplicaci�n
Source: E:\CREAR INSTALADOR CON INNO SETUP\Archivos\Mantenimiento.exe; DestDir: {app}; Flags: ignoreversion
Source: E:\CREAR INSTALADOR CON INNO SETUP\Archivos\*; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: E:\CREAR INSTALADOR CON INNO SETUP\Script\complementos\script.sql*; DestDir: {tmp}; Flags : ignoreversion deleteafterinstall

;******************************************************************************************************************************************


; Omitir esta linea [INI] - No tocar o modificar la siguiente l�nea
[INI]


;******************************************************************************************************************************************
; [Icons]: Estos son los �conos que el instalador creara en el grupo de programas del sistema de Windows
;******************************************************************************************************************************************
[Icons]

; Nota: Aqu� se incluye: El �cono para abrir el programa
;                        El �cono para desinstalar el programa
;                        El �cono que se ubica en el escritorio
; -----------------------------------------------------------------------------------------------------------------------------------------
; {group} = nombre del grupo de programa que se defini� arriba en el par�metro: DefaultGroupName=
;           (Por lo general es el mismo nombre de la aplicaci�n)
;Name: {group}\AlmacenDeDocumentos; Filename: {app}\folder.exe; WorkingDir: {app}; IconIndex: 0
;Name: {group}\Desinstalar AlmacenDeDocumentos; Filename: {uninstallexe}
;Name: {userdesktop}\AlmacenDeDocumentos; Filename: {app}\folder.exe; Tasks: desktopicon; WorkingDir: {app}; IconIndex: 0

Name: {group}\AppMantenimiento; Filename: {app}\Mantenimiento.exe; WorkingDir: {app}; IconFilename: {app}\Iconos\icono.ico; Comment: "Ejecutable"; 
Name: {commondesktop}\AppMantenimiento; Filename: {app}\Mantenimiento.exe; WorkingDir: {app}; IconFilename: {app}\Iconos\icono.ico; Comment: "Ejecutable escritorio";
Name: {group}\Desinstalar; Filename: {uninstallexe}; WorkingDir: {app}; IconFilename: {app}\Iconos\unistall.ico; Comment: "Unistaller";




;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Run]: Estos son los programas que se instalar como complementos de nuestra aplicaci�n
;******************************************************************************************************************************************
[Run]

; Nota: Esto se ejecuta al momento de la instalaci�n de nuestro programa

; Instalamos MySQL
; (Aqu� tenemos que poner el nombre de nuestro motor de base de datos que se encuentra en nuestra carpeta complementos)
Filename: {src}\complementos\wampserver.exe; Parameters: "/q:a /C:""install /q"""; WorkingDir: {src}\complementos;

; Esto nos permite crear la base de datos
; (Aqu� ponemos el nombre de nuestra base de datos y cambiamos nuestra ruta  C:\ si es necesario)
Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -h localhost -e ""create database josep CHARACTER SET 'utf8' COLLATE utf8_spanish_ci";  WorkingDir: {tmp}; StatusMsg: Creando la Base dedatos; Flags: runhidden

; Cargamos la base de datos
; (Acedemos a nuestra base de datos, cargamos nuestras tablas coon nuestro arcchivo [.sql] y cambiamos nuestra ruta  C:\ si es necesario)
Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -h localhost -e ""use josep; source script.sql;";  WorkingDir: {tmp}; StatusMsg: Creando Tablas; Flags: runhidden

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Messages]: Estos mensajes simplemente son un override ya que vienen en ingl�s
;             (Cambia los valores de las etiquetas para que aparezcan con el nombre de tu aplicaci�n)
;******************************************************************************************************************************************
[Messages]

; Este es el t�tulo que se mostrara al momento de iniciar el cuadro de dialogo de la instalaci�n (Cambia el Nombre_Aplicaci�n por el nombre de tu aplicacion)
WelcomeLabel1=Instalaci�n de AppMantenimiento

; Este es e� titulo que se mostrara debajo del titulo (Cambia el Nombre_Aplicaci�n por el nombre de tu aplicacion)
WelcomeLabel2=Este proceso instalar� AppMantenimiento.%n%nSe recomienda cerrar todas las aplicaciones abiertas%nantes de continuar.

;******************************************************************************************************************************************