<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Adicionar multa</h1>
      </div>


      <form class="form-horizontal">
        <fieldset>
        <legend>Login do torcedor</legend>
          <div class="control-group">
            <label class="control-label" for="value">Valor</label>
            <div class="controls">
              <input id="value" type="text" class="span2">
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="description">Descrição</label>
            <div class="controls">
              <textarea id="description" class="span3"></textarea>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="here">Data</label>
            <div class="controls">
              <!-- Como usar o DatePicker: http://www.eyecon.ro/bootstrap-datepicker/ -->
              <div class="input-append date" id="dp1" data-date-format="dd-mm-yyyy">
                <input type="text" class="span3 datepicker">
                <span class="add-on"><i class="icon-th"></i></span>
              </div>
            </div>
          </div>
          <div class="control-group">
            <div class="controls">
              <button type="submit" class="btn">Aplicar</button>
            </div>
          </div>
        </fieldset>
      </form>

    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
