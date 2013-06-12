<?php include "inc/header.php"; ?>

    <div class="container">
      <div class="page-header">
        <h1>Reservas</h1>
      </div>
      <div class="page-sub-header">
        <div>
          <input class="table-filter" type="text" class="filter" placeholder="Filtrar por data...">
          <?php include "inc/datePicker.php"; ?>
        </div>
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por cód. cadeira...">
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por torcedor...">
        <button class="btn" onclick="window.location.href='adicionarReserva.php'">Adicionar Reserva</button>
      </div>
      <table class="table table-hover">
        <tbody>
          <tr class="thead">
            <td> Data </td>
            <td> Cod. Cadeira </td>
            <td> Torcedor </td>
            <td> 3/5 </td>
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
