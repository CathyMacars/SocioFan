<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Adicionar Reserva</h1>
      </div>

      <form class="form-horizontal">
          <fieldset>
              <legend>
                <input type="text" class="input-xlarge" id="title-input" placeholder="Digite o nome do torcedor">
              </legend>
            </fieldset>
            <fieldset>
            <div class="control-group">
              <label class="control-label" for="value">Cód. Cadeira</label>
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
              <button type="button" onclick="window.location.href='reservas.php'" class="btn">Cancelar</button>
              <button type="submit" onclick="window.location.href='reservas.php'" class="btn btn-primary">Salvar</button>
            </div>
          </div>
        </fieldset>
      </form>

    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
