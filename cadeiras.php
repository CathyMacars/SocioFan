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

        <button class="btn" onclick="window.location.href='addeditCadeira.php'">Adicionar Cadeira</button>
      </div>


      <table class="table table-hover">
        <tbody>
           <tr class="thead">
                 <td> Cód Cadeira </td>
                 <td> Disponível? </td>
                 <td> 3/5 </td>
            </tr>
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
