<%-- 
    Document   : libros
    Created on : 05-oct-2019, 20:27:39
    Author     : Cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de libros </h1>
        <form>
            <div>
                  <label for="isbn">Isbn:</label>
		  <input id="isb" name="isbn" type="text" placeholder="Escriba isb" />
            </div>
             <div>
                  <label for="nombre">Nombre:</label>
		  <input id="nombre" name="nombre" type="text" placeholder="Escriba nombre" />
            </div>
             <div>
                  <label for="descripcion">Descripcion:</label>
		  <input id="descripcion" name="descripcion" type="text" placeholder="Escriba descripcion" />
            </div>
            <div>
                  <label for="clasificacion">Clasificacion:</label>
		  <input id="clasificacion" name="clasificacion" type="text" placeholder="Escriba clasificaciòn" />
            </div>
            <div>
                  <label for="cantidad">Clasificacion:</label>
		  <input id="cantidad" name="cantidad" type="text" placeholder="Escriba cantidad" />
            </div>
             <div>
		  <input type="submit" value="enviar" />
            </div>
    </body>
</html>
