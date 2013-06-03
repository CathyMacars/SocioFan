<?php include "inc/header.php"; ?>

  <div class="container">

    <div class="page-header">
      <h1>Editar / Adicionar</h1>
    </div>

    <div class="row-fluid">
        <form class="form-horizontal">
          <fieldset>
            <legend>
              <input type="text" class="input-xlarge" id="title-input" placeholder="Digite o nome do torcedor">
            </legend>
          </fieldset>



          <div class="span4">
            <fieldset>
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
                    <input id="here" class="span6" type="text" placeholder="RG">
                    <input id="here" class="span6" type="text" placeholder="CPF">
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
                  <input id="here" class="span8" type="text">
                  <input id="here" class="span4" type="text" placeholder="No">
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
                  <button type="submit" class="btn">Salvar</button>
                </div>
              </div>
            </fieldset>
          </div>
        </form>
    </div>


  </div> <!-- /container -->

 <?php include "inc/footer.php"; ?>
