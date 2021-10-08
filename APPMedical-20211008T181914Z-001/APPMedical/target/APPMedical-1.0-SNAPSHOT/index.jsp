<%-- 
    Document   : index
    Created on : 28/09/2021, 7:54:45 p. m.
    Author     : G2-S36
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Proyecto Clinica G2 - S36</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%-- Integración de librerias --%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-
B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
        
    </head>
    <style type="text/css">
        .messages {
            color: darkblue;
        }
        form.ng-submitted input.ng-invalid{
            border-color: darkblue;
        }
        form input.ng-invalid.ng-touched{
            border-color: darkblue;
        }
        .header {
                color: #36A0FF;
                font-size: 27px;
                padding: 10px;
            }

            .bigicon {
                font-size: 35px;
                color: #36A0FF;
            }
    </style>
    
    <body>
        <div class="container-fluid" ng-app="APPMedical" ng-controller="pacienteController as pcte">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="well well-sm">
                            <legend class="text-center header"><h1>Aplicación APPMedical G2-S36 </h1></legend>
                            <form class="form-horizontal" method="post">
                                <fieldset>
                                    <legend class="text-center header">Registrar Paciente</legend>
                                    <div class="form-group">
                                        <div class="row col-md-12">
                                            <span class="text-center"><i class="fa fa-user bigicon"></i></span>
                                            <div class="col-md-6">
                                                <input id="fname" name="name" type="text" placeholder="Nombres" class="form-control">
                                            </div>
                                            <div class="col-md-6">
                                                <input id="lname" name="name" type="text" placeholder="Apellidos" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                         <div class="row col-md-12">
                                            <span class="text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                                            <div class="col-md-6">
                                                <select class="form-select form-control" aria-label="Default select example">
                                                    <option selected>Tipo De Documento</option>
                                                    <option value="1">Cedula De Ciudadania</option>
                                                    <option value="2">Tarjeta De Identidad</option>
                                                    <option value="3">Pasaporte</option>
                                                </select>
                                            </div>
                                            <div class="col-md-6">
                                                <input id="documento" name="documento" type="text" placeholder="Numero Documento" class="form-control">
                                            </div>
                                         </div>
                                    </div>
                                    
                                    <div class="form-group">
                                         <div class="row col-md-12">
                                            <span class=" text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                                            <div class="col-md-6">
                                                <input id="email" name="email" type="text" placeholder="Email Address" class="form-control">
                                            </div>
                                            <div class="col-md-6">
                                                <input id="telefono" name="Telefono" type="text" placeholder="Telefono" class="form-control">
                                            </div>
                                         </div>
                                    </div>
                                    

                                    <div class="form-group">
                                         <div class="row col-md-12">
                                            <span class="text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                                            <div class="col-md-12">
                                                <textarea class="form-control" id="message" name="message" placeholder="Enter your massage for us here. We will get back to you within 2 business days." rows="7"></textarea>
                                            </div>
                                         </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12 text-center">
                                            <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>	
        </div>
    </body>
    <script>
        <%-- Codigo Angular --%>
    </script>
</html>
