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

Name: {group}\PragmaticKey; Filename: {app}\PragmaticKey.exe; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Ejecutable"; 
Name: {commondesktop}\PragmaticKey; Filename: {app}\PragmaticKey.exe; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Ejecutable escritorio";
Name: {group}\Desinstalar; Filename: {uninstallexe}; WorkingDir: {app}; IconFilename: {app}\keyboard.ico; Comment: "Unistaller";




;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Run]: Estos son los programas que se instalar como complementos de nuestra aplicaci�n
;******************************************************************************************************************************************
[Run]

; Nota: Esto se ejecuta al momento de la instalaci�n de nuestro programa


;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Messages]: Estos mensajes simplemente son un override ya que vienen en ingl�s
;             (Cambia los valores de las etiquetas para que aparezcan con el nombre de tu aplicaci�n)
;******************************************************************************************************************************************
[Messages]

; Este es el t�tulo que se mostrara al momento de iniciar el cuadro de dialogo de la instalaci�n (Cambia el Nombre_Aplicaci�n por el nombre de tu aplicacion)
WelcomeLabel1=Crear Instancia de PragmaticKey 

; Este es e� titulo que se mostrara debajo del titulo (Cambia el Nombre_Aplicaci�n por el nombre de tu aplicacion)
WelcomeLabel2=Este instanciara PragmaticKey.%n%nSe recomienda cerrar todas las aplicaciones abiertas%nantes de continuar.

;******************************************************************************************************************************************