# JFrame
Laboratorio Programación Avanzada
En un departamento de IT llegan numerosas incidencias de todo tipo, como, por ejemplo, incidencias relacionadas con equipos de red (switch´s, Reuters), servidores, ordenadores personales, móviles, etc. Los técnicos resuelven estas incidencias y como información de cierre imputa el tiempo empleado en la resolución, posteriormente el coordinador con la información de estos tiempos obtendrá informes de rendimiento para ver cómo funciona su departamento.
Se desea desarrollar un pequeño programa que mediante una interfaz gráfica permita asignar técnicos a incidencias que se han producido. El técnico una vez terminado el trabajo deberá anotar el tiempo de resolución y cerrar la incidencia, la fecha de cierre se establecerá automáticamente cuando se impute el tiempo de resolución. El programa deberá permitir obtener distintos informes de rendimiento.
Requisitos:
Una Incidencia se caracteriza por la siguiente información:
- Un identificador alfanumérico: Ej IC0001
- Una descripción breve de la incidencia.
- Una fecha de creación: En formato día/mes/año
- Una fecha de cierre. En formato día/mes/año
- Un estado, que podrá ser: abierta, en progreso, cerrada
- Un Técnico asociado: Si la incidencia no tiene técnico asociado no se puede cambiar de estado. La incidencia solo puede tener un único Técnico asociado
- Tiempo de resolución (horas): Ejemplo 2 horas
Un Técnico esta caracterizado por:
- Nombre completo
- Nivel ( N1,N2,N3)
A continuación, se muestran una serie de prototipos de interfaz gráfica que pueden servir de guía de diseño
Prototipo de InterfazGráficaPrincipal
Prototipo interfaz gráfica para asignación de técnico a incidencia
La información se asignación del técnico a la incidencia se debe actualizar cuando se pulse el botón Asignar de la interfaz
Actualizar
Actualizar
Act
Actuaualizalizarrrr
El botón denominado Ver informes muestra la siguiente interfaz
Prototipo interfaz gráfica informes de rendimiento
Contenidos a entregar:
- Diagrama del modelo de clases que represente la información de técnicos e incidencias exclusivamente
- Implementación en java del modelo de clases anterior
- Diseño e implementación de la interfaz gráfica siguiendo los prototipos de interfaz planeados
- Se deben controlar las siguientes condiciones de error
o Asignar una Incidencia cerrada a un Técnico
o Asignar un Técnico a una Incidencia que ya tiene un Técnico asignada
o
- Todo el código de implementación se debe entregar en un proyecto java en eclipse
- Test de prueba con los siguientes datos: Incidencia Técnico
(IC001, Problema aplicación Outlook,2/3/2020, Andrés Quirón Pérez, en progreso,0)
Andrés Quirón Pérez
(IC002, Problema en disco, 7/4/2021, Andrés Quirón Pérez, en progreso,0)
Alberto Jiménez García
(IC003, Problema en SharePoint, 7/4/2021, Andrés Quirón Pérez, en progreso,0)
(IC003, Problema en SharePoint, 8/4/2021, Alberto Jiménez García, cerrada, 120)
(I003, Problema en Adobe, 7/4/2021, abierta,0)
NOTA IMPORTANTE: Las Incidencias y Técnicos deben existir previamente, no deben habilitarse interfaces de creación de estas entidades. Use dos colecciones para almacenar la información de Técnicos e Incidencias y haga que estás dos colecciones estén precargadas al ejecutar el programa.
NOTA IMPORTANTE: Si el proyecto tiene errores de compilación se evaluará como suspenso
