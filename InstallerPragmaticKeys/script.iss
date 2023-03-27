[Setup]
AppName=PragmaticKey

DefaultGroupNumber=PramaticKey

AppPublisher=SoftwarePark

AppPublisherURL=https://github.com/Zelechos/PragmaticKey

AppVersion=v0.1.0

AllowNoIcons=no


AppCopyright=Copyright @ 2023-2024 SoftwarePark


PrivilegesRequired=admin


OutputBaseFilename=PragmaticKey


DefaultDirName={autopf}\PramaticKey


UninstallDisplayIcon={app}\keyboard.ico

UninstallDisplayName=Desinstalar PragmaticKey


[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: desktopicon; Description: Create a & desktop icon; GroupDescription: Additional icons:


[Files]
Source: C:\Users\Zelec\OneDrive\Desktop\InstallerPragmaticKeys\PragmaticKey.exe; DestDir: {app}; Flags: ignoreversion
Source: C:\Users\Zelec\OneDrive\Desktop\InstallerPragmaticKeys\*; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs




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

Name: {group}\PragmaticKey; Filename: {app}\PragmaticKey.exe; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Ejecutable"; 
Name: {commondesktop}\PragmaticKey; Filename: {app}\PragmaticKey.exe; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Ejecutable escritorio";
Name: {group}\Desinstalar; Filename: {uninstallexe}; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Unistaller";




;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Run]: Estos son los programas que se instalar como complementos de nuestra aplicación
;******************************************************************************************************************************************
[Run]

; Nota: Esto se ejecuta al momento de la instalación de nuestro programa


;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Messages]: Estos mensajes simplemente son un override ya que vienen en inglés
;             (Cambia los valores de las etiquetas para que aparezcan con el nombre de tu aplicación)
;******************************************************************************************************************************************
[Messages]

; Este es el título que se mostrara al momento de iniciar el cuadro de dialogo de la instalación (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel1=Crear Instancia de PragmaticKey 

; Este es eñ titulo que se mostrara debajo del titulo (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel2=Este instanciara PragmaticKey.%n%nSe recomienda cerrar todas las aplicaciones abiertas%nantes de continuar.

;******************************************************************************************************************************************