# Monitoreo de Espacio en Disco

Script principal: `disk-space-monitor.ps1`

## Objetivo
Monitorear discos locales, detectar volumenes por debajo de un umbral configurable, guardar historico en SQL y notificar incidentes.

## Funcionamiento
1. Obtiene discos locales con `Get-CimInstance Win32_LogicalDisk`.
2. Calcula porcentaje libre por unidad.
3. Inserta resultados en SQL (`dbo.DiskSpaceHistory`).
4. Marca alerta cuando el porcentaje libre es menor a `ThresholdPercent`.
5. Registra logs JSON diarios.
6. Notifica por SMTP y Telegram cuando hay alertas o errores.

## Prerequisitos
- Windows Server 2019/2022
- PowerShell 5.1+
- Acceso a SQL Server
- SMTP y salida HTTPS a Telegram

## Configuracion
En `CONFIG`:
- `ThresholdPercent` (ejemplo 20)
- `Sql.Server`, `Sql.Database`, `Sql.Table`
- `Sql.UseIntegratedSecurity`
- `Notification.Mail.*`
- `Notification.Telegram.*`

## Variables de entorno
- `AUTOMATION_SQL_PASSWORD` (si SQL auth)
- `AUTOMATION_SMTP_PASSWORD`
- `AUTOMATION_TELEGRAM_BOT_TOKEN`
- `AUTOMATION_TELEGRAM_CHAT_ID`

## Estructura SQL esperada (referencia)
Tabla: `dbo.DiskSpaceHistory`
Campos sugeridos:
- `ServerName`
- `DriveLetter`
- `TotalGB`
- `FreeGB`
- `FreePercent`
- `CapturedAt`

## Como ejecutar

```powershell
cd C:\Users\Nabetse\Downloads\server\Academico
.\disk-space-monitor.ps1
```

## Programar en Task Scheduler
- Trigger: cada 30 min o cada hora
- Action: `powershell.exe`
- Arguments: `-ExecutionPolicy Bypass -File "C:\Users\Nabetse\Downloads\server\Academico\disk-space-monitor.ps1"`

## Que revisar
- Logs en `C:\Scripts\Logs\Disk-Space-Monitor`
- Historico en SQL
- Alertas recibidas cuando un disco baja del umbral

## Seguridad
- Credenciales fuera del script
- Cuenta de servicio con permisos minimos
- Revisar retencion y permisos de logs
---
## ‍ Desarrollado por Isaac Esteban Haro Torres
**Ingeniero en Sistemas · Full Stack · Automatización · Data**
-  Email: zackharo1@gmail.com
-  WhatsApp: 098805517
-  GitHub: https://github.com/ieharo1
-  Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/
---
##  Licencia
© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
