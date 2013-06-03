<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Torcedores</h1>
      </div>

      <div class="page-sub-header">
        <select>
          <option disabled="disabled" selected="selected">Filtrar por modalidade</option>
          <option>Modalidade A</option>
          <option>Modalidade B</option>
          <option>Modalidade C</option>
        </select>

        <input class="fan-filter" type="text" class="filter" placeholder="Filtrar por login...">

        <button class="btn">Adicionar Torcedor</button>
      </div>


      <table class="fan-table">
        <thead>
            <tr>
                 <th> Login </th>
                 <th> Modalidade </th>
                 <th>  </th>
            </tr>
        </thead>
        <tbody>
            <tr>
                 <td> Login </td>
                 <td> Modalidade </td>
                 <td> <?php include "inc/actions.php"; ?> </td>
            </tr>
            <tr>
                 <td> Login </td>
                 <td> Modalidade </td>
                 <td> <?php include "inc/actions.php"; ?> </td>
            </tr>
            <tr>
                 <td> Login </td>
                 <td> Modalidade </td>
                 <td> <?php include "inc/actions.php"; ?> </td>
            </tr>
        </tbody>
      </table>
    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
