<?php include "inc/header.php"; ?>

    <div class="container">

      <div class="page-header">
        <h1>Editar</h1>
      </div>


      <fieldset class="edit-fan">
        <legend>
          <input type="text" id="teste" placeholder="digite o nome do torcedor" value="Nome do torcedor">
        </legend>
        <form class="form-horizontal">
          <div class="control-group">
            <label class="control-label" for="here">Sexo</label>
            <div class="controls">
              <label for="here" class="radio inline">
                <input id="here" type="radio"> Masculino
              </label>
              <label for="here" class="radio inline">
                <input id="here" type="radio"> Feminino
              </label>
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Estado Civil</label>
            <div class="controls">
              <select id="here">
                <option disabled="disabled" selected="selected">Selecione</option>
                <option>Casado(a)</option>
                <option>Solteiro(a)</option>
                <option>Divorciado(a) / Separado(a)</option>
              </select>
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Nome do Pai</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Nome da Mãe</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Identidade</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">CPF</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Profissão</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Rua</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">No</label>
            <div class="controls">
              <input id="here" type="text" class="input-mini">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Complemento</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Bairro</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Cidade</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">CEP</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">E-mail</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Tel. Residencial</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Celular</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <label class="control-label" for="here">Tel. Comercial</label>
            <div class="controls">
              <input id="here" type="text">
            </div>
          </div>

          <div class="control-group">
            <div class="controls">
              <button type="submit" class="btn">Salvar</button>
            </div>
          </div>
        </form>
      </fieldset>


    </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
