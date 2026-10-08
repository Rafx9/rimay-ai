<div align="center">

# RimayAI

### Sistema de pedidos para pollerías con recepcionista de voz y agentes de inteligencia artificial

<br>

<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/Maven-build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white">
<img src="https://img.shields.io/badge/Swing-UI-5382A1?style=for-the-badge">
<br>
<img src="https://img.shields.io/badge/OpenAI-Realtime-412991?style=for-the-badge&logo=openai&logoColor=white">
<img src="https://img.shields.io/badge/WhatsApp-Evolution%20API-25D366?style=for-the-badge&logo=whatsapp&logoColor=white">
<br>
<img src="https://img.shields.io/badge/clases-35-blue?style=flat-square">
<img src="https://img.shields.io/badge/paquetes-5-blue?style=flat-square">
<img src="https://img.shields.io/badge/estado-avance%2030%25-yellow?style=flat-square">

</div>

---

## ¿Qué problema resuelve?

En hora punta, una pollería no alcanza a atender todas las llamadas y pierde pedidos. **RimayAI** asigna esa tarea a una recepcionista de inteligencia artificial que conversa por voz, identifica al cliente, verifica el stock disponible y registra el pedido sin intervención humana.

Además, un conjunto de **agentes de IA analiza la operación diaria** y propone decisiones fundamentadas sobre promociones, reposición de stock y asignación de repartidores. Cada propuesta incluye su justificación y la decisión final siempre la toma una persona.

> [!NOTE]
> El sistema **funciona completo sin IA**. La inteligencia artificial automatiza y potencia la operación, pero si no está disponible, la cajera continúa trabajando con normalidad desde la caja.

## Funcionalidades

| Función | Descripción |
|---|---|
| **Caja** | Registro manual de pedidos, seguimiento de todos los pedidos y actualización de su estado |
| **Recepcionista IA** | Atiende llamadas por voz en tiempo real, reconoce al cliente y le sugiere su pedido habitual |
| **Stock en tiempo real** | Verifica la disponibilidad antes de confirmar cada pedido y reserva productos para entregas programadas |
| **Agente de promociones** | Analiza el historial de compras y propone beneficios para clientes frecuentes y para recuperar clientes inactivos |
| **Agente de inventario** | Proyecta cuándo se agotará cada producto según el ritmo de ventas y recomienda reponer a tiempo |
| **Agente de reparto** | Sugiere el repartidor más adecuado para cada pedido según su disponibilidad y zona |
| **Panel de decisiones** | Centraliza las propuestas de los agentes para que la cajera las apruebe o rechace |
| **WhatsApp** | Notifica al cliente la confirmación, cada cambio de estado y sus promociones; envía cada pedido nuevo a cocina |

## Estructura del proyecto

El sistema está compuesto por **35 clases** distribuidas en **5 paquetes**, cada uno con una responsabilidad definida.

| Paquete | Responsabilidad | Clases |
|---|---|---|
| `modelo` | Entidades del negocio | Pedido, PedidoTelefonico, PedidoCaja, DetallePedido, Producto, Cliente, Reserva, Promocion, Repartidor, EstadoPedido, SegmentoCliente |
| `servicio` | Lógica de negocio | GestorPedidos, Menu, Configuracion, Inventario, GestorClientes, GestorReparto, ReporteVentas |
| `ai` | Inteligencia artificial | RecepcionistaVoz, OpenAIRealtime, Microfono, Parlante, AgenteIA, AgentePromociones, AgenteInventario, AgenteReparto, Decision |
| `mensajeria` | Notificaciones | CanalMensajeria, EvolutionApiCanal, ConsolaCanal |
| `vista` | Interfaz gráfica | VentanaCaja, VentanaLlamada, VentanaDecisiones, VentanaInventario, Main |

## Diagrama UML

### Vista general

![Vista general](docs/01-general.png)

<details>
<summary><b>Ver el detalle de cada paquete</b></summary>

### modelo
![Paquete modelo](docs/02-modelo.png)

### servicio
![Paquete servicio](docs/03-servicio.png)

### ai · Recepcionista de voz
![Recepcionista de voz](docs/04-ai-recepcionista.png)

### ai · Agentes de decisión
![Agentes de IA](docs/05-ai-agentes.png)

### mensajeria
![Paquete mensajeria](docs/06-mensajeria.png)

### vista
![Paquete vista](docs/07-vista.png)

### Diagrama completo
![Diagrama completo](docs/00-completo.png)

</details>

## Tecnologías

- **Java 21** con **Maven** como lenguaje y gestor del proyecto
- **Swing** (NetBeans) para la interfaz gráfica
- **OpenAI Realtime API** para la conversación por voz en tiempo real
- **OpenAI API** para el análisis y las decisiones de los agentes
- **Evolution API** (open source) para la mensajería por WhatsApp

## Equipo

- Fabian Ordoñez
- Marielena Valladares
- Rafael Flores
- Lenning Sandoval

---

<div align="center">
<sub>Programación Orientada a Objetos - Universidad Tecnológica del Perú</sub>
</div>
