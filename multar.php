<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Adicionar multa</h1>
      </div>


      <fieldset>
        <legend>Login do torcedor</legend>
        <form class="form-horizontal">
          <div class="control-group">
            <label class="control-label" for="value">Valor</label>
            <div class="controls">
              <input id="value" type="text">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="description">Descrição</label>
            <div class="controls">
              <textarea id="description"></textarea>
            </div>
          </div>
          <div class="control-group">
            <div class="controls">
              <button type="submit" class="btn">Aplicar</button>
            </div>
          </div>
        </form>
      </fieldset>

    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
