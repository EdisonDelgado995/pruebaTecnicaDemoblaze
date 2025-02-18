#language: es
Característica: Compra en Demoblaze

  Escenario: Compra de productos en Demoblaze
    Dado que se tiene el catalogo de Demoblaze
    Cuando se agrega el producto de tipo 'Laptops' de referencia 'Sony vaio i7'
    Y se agrega el producto de tipo 'Monitors' de referencia 'ASUS Full HD'
    Y se confirma la compra de los productos
    Entonces se recibe confirmacion de la compra
