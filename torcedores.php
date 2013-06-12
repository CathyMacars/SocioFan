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
        <input class="table-filter" type="text" class="filter" placeholder="Filtrar por login...">
        <button class="btn" onclick="window.location.href='addeditTorcedor.php'">Adicionar Torcedor</button>
      </div>
      <table class="table table-hover">
<!--         <thead>
          <tr>
            <th>Test</th>
            <th>Test</th>
            <th>Test</th>
          </tr>
        </thead> -->
        <tbody>
          <tr class="thead">
            <td> Login </td>
            <td> Modalidade </td>
            <td> 3/5 </td>
          </tr>
          <tr>
            <td> Login </td>
            <td> Modalidade </td>
            <td> <?php include "inc/fanTableActions.php"; ?> </td>
          </tr>
          <tr>
            <td> Login </td>
            <td> Modalidade </td>
            <td> <?php include "inc/fanTableActions.php"; ?> </td>
          </tr>
          <tr>
            <td> Login </td>
            <td> Modalidade </td>
            <td> <?php include "inc/fanTableActions.php"; ?> </td>
          </tr>
        </tbody>
      </table>
    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
