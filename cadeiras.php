<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Cadeiras</h1>
      </div>

      <div class="page-sub-header">
        <select>
          <option disabled="disabled" selected="selected">Filtrar cadeiras...</option>
          <option>Disponíveis</option>
          <option>Ocupadas</option>
          <option>Reservadas</option>
        </select>

        <button class="btn" onclick="window.location.href='adicionarCadeira.php'">Adicionar Cadeira</button>
      </div>


      <table class="table table-hover">
        <thead>
            <tr>
                 <th> Cód Cadeira </th>
                 <th> Disponível? </th>
                 <th> 3/5 </th>
            </tr>
        </thead>
        <tbody>
            <tr>
                 <td> 000 </td>
                 <td> Sim </td>
                 <td> <?php include "inc/seatsTableActions.php"; ?> </td>
            </tr>
            <tr>
                 <td> 000 </td>
                 <td> Não </td>
                 <td> <?php include "inc/seatsTableActions.php"; ?> </td>
            </tr>
            <tr>
                 <td> 000 </td>
                 <td> Sim </td>
                 <td> <?php include "inc/seatsTableActions.php"; ?> </td>
            </tr>
        </tbody>
      </table>
    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
