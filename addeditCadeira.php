<?php include "inc/header.php"; ?>

    <div class="container">
      <div class="page-header">
        <h1>Adicionar / Editar Cadeira</h1>
      </div>
      <form class="form-horizontal">
        <fieldset>
        <legend>Login do torcedor</legend>  <!-- colocar a classe "hide" quando não for pra mostrar-->
          <div class="control-group">
            <label class="control-label" for="value">Cód. Cadeira</label>
            <div class="controls">
              <input id="value" type="text" class="span2">
            </div>
          </div>
          <div class="control-group"> <!-- colocar a classe "hide" quando não for pra mostrar-->
            <label class="control-label" for="value">Reservas</label>
            <div class="controls">
              <ul>
                <li><span>01/01/2013</span>&nbsp;-&nbsp;<span>Login</span></li>
                <li><span>01/01/2013</span>&nbsp;-&nbsp;<span>Login</span></li>
                <li><span>01/01/2013</span>&nbsp;-&nbsp;<span>Login</span></li>
              </ul>
            </div>
          </div>
          <div class="control-group">
            <div class="controls">
              <button type="button" onclick="window.location.href='cadeiras.php'" class="btn">Cancelar</button>
              <button type="submit" onclick="window.location.href='cadeiras.php'" class="btn btn-primary">Salvar</button>
            </div>
          </div>
        </fieldset>
      </form>
    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
