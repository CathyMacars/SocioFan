<?php include "inc/header.php"; ?>

  <div class="container">

    <div class="page-header">
      <h1>Editar / Adicionar Torcedor</h1>
    </div>

    <div class="row-fluid">
        <form>
          <fieldset>
            <legend>
              <input type="text" class="input-xlarge" id="title-input" placeholder="Digite o nome do torcedor">
            </legend>
          </fieldset>



          <div class="span4">
            <fieldset>
              <div class="control-group">
                  <label class="control-label" for="here">Nascimento</label>
                  <div class="controls">
                    <!-- Como usar o DatePicker: http://www.eyecon.ro/bootstrap-datepicker/ -->
                    <div class="input-append date" id="dp1" data-date-format="dd-mm-yyyy">
                      <input type="text" class="span11 datepicker">
                      <span class="add-on"><i class="icon-th"></i></span>
                    </div>
                  </div>
                </div>

                <div class="control-group">
                  <label class="control-label" for="here">Sexo</label>
                  <div class="controls">
                    <label for="masc" class="radio inline">
                      <input id="masc" type="radio" checked> Masculino
                    </label>
                    <label for="fem" class="radio inline">
                      <input id="fem" type="radio"> Feminino
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
                  <label class="control-label" for="here">Identificação</label>
                  <div class="controls">
                    <input id="here" class="span3" type="text" placeholder="RG">
                    <input id="here" class="span4" type="text" placeholder="CPF">
                  </div>
                </div>

                <div class="control-group">
                  <label class="control-label" for="here">Profissão</label>
                  <div class="controls">
                    <input id="here" type="text">
                  </div>
                </div>
              </fieldset>
          </div>



          <div class="span4">
            <fieldset>
              <div class="control-group">
                <label class="control-label" for="here">Rua</label>
                <div class="controls">
                  <input id="here" class="span5" type="text">
                  <input id="here" class="span2" type="text" placeholder="No">
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
            </fieldset>
          </div>



          <div class="span4">
            <fieldset>
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
              <button type="button" onclick="window.location.href='index.php'" class="btn">Cancelar</button>
              <button type="submit" onclick="window.location.href='index.php'" class="btn btn-primary">Salvar</button>
            </div>
          </div>
            </fieldset>
          </div>
        </form>
    </div>


  </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
