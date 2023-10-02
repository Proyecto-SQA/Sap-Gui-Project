Feature: Orden de compra
	Como usuario de Sap ERP,
	quiero poder crear órdenes de compra para nuevos productos y materiales de manera fácil y eficiente en SAP ERP,
	para que pueda realizar pedidos de manera oportuna y satisfacer las necesidades de mi equipo y proveedores.

  Scenario: Crear una nueva orden de compra
    Given que el usuario ha iniciado sesion en SAP ERP
    When realiza la orden de compra para nuevos productos y materiales
    Then la orden de compra se crea correctamente en SAP ERP