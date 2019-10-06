<%-- 
    Document   : prestamo_form
    Created on : 5/10/2019, 06:42:32 PM
    Author     : JOAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <h1>Registro de Prestamos</h1>
            <form method="post" action="<%= request.getContextPath() %>/RegistroPrestamoServlet">
                <div class="form-group">
                    <label for="idprestamo">
                        ID Prestamo
                    </label>
                    <input id="idprestamo" name="idprestamo" class="form-control" type="text" placeholder="Identificación del prestamo">
                </div>
                <div class="form-group">
                    <label for="fechaprestamo">
                        Fecha del prestamo
                    </label>
                    <input id="fechaprestamo" name="fechaprestamo" class="form-control" type="date" placeholder="Fecha del prestamo">
                </div>
                <div class="form-group">
                    <label for="fechaentrega">
                        Fecha de entrega
                    </label>
                    <input id="fechaentrega" name="fechaentrega" class="form-control" type="date" placeholder="Fecha de entrega">
                </div>
                <div class="form-group">
                    <label for="estado">
                        Estado
                    </label>
                    <input id="estado" name="estado" class="form-control" type="text" placeholder="Estado del prestamo">
                </div>
                <div class="form-group">
                    <label for="isbnlibro">
                        ISBN del Libro
                    </label>
                    <input id="isbnlibro" name="isbnlibro" class="form-control" type="text" placeholder="ISBN del libro">
                </div>
                <div class="form-group">
                    <label for="cedulausuario">
                        Cedula del usuario
                    </label>
                    <input id="cedulausuario" name="cedulausuario" class="form-control" type="text" placeholder="ICedula del usuario">
                </div>
                <div class="form-group">
                    <input type="submit" value="Registrar" class="btn btn-primary"/>
                </div>
            </form>
        </div>
    </body>
</html>
