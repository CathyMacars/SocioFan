<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Reservas</h1>
      </div>

      <div class="page-sub-header">
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por data...">
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por cód. cadeira...">
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por torcedor...">

        <button class="btn">Adicionar Reserva</button>
      </div>


      <table class="table table-hover">
        <thead>
            <tr>
                 <th> Data </th>
                 <th> Cod. Cadeira </th>
                 <th> Torcedor </th>
                 <th>  </th>
            </tr>
        </thead>
        <tbody>
            <tr>
                 <td> xx/xx/xxxx </td>
                 <td> 000 </td>
                 <td> Login </td>
                 <td> <?php include "inc/reservationsTableActions.php"; ?> </td>
            </tr>
            <tr>
                 <td> xx/xx/xxxx </td>
                 <td> 000 </td>
                 <td> Login </td>
                 <td> <?php include "inc/reservationsTableActions.php"; ?> </td>
            </tr>
            <tr>
                 <td> xx/xx/xxxx </td>
                 <td> 000 </td>
                 <td> Login </td>
                 <td> <?php include "inc/reservationsTableActions.php"; ?> </td>
            </tr>
        </tbody>
      </table>

    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
