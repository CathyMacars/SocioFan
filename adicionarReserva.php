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
                <!-- <div class="input-append date" id="dp1" data-date-format="dd-mm-yyyy"> -->
                  <input type="text" class="span3 datepicker">
                  <!-- <span class="add-on"><i class="icon-th"></i></span>
                </div> -->
                <div class="dateBoxPopup" style="left: 286px; top: 367px; visibility: visible; position: absolute; overflow: visible;">
                  <div class="popupContent">
                    <table cellspacing="0" cellpadding="0" class="gwt-DatePicker">
                      <tbody>
                        <tr>
                          <td align="left" style="vertical-align: top;">
                            <table class="datePickerMonthSelector">
                              <colgroup>
                                <col>
                                <col>
                                <col>
                              </colgroup>
                              <tbody>
                                <tr>
                                  <td width="1">
                                    <div tabindex="0" class="datePickerPreviousButton datePickerPreviousButton-up" role="button" aria-pressed="false">
                                      <input type="text" tabindex="-1" role="presentation" style="opacity: 0; height: 1px; width: 1px; z-index: -1; overflow: hidden; position: absolute;">
                                      <div class="html-face">«</div>
                                    </div>
                                  </td>
                                  <td class="datePickerMonth" width="100%">2013 Jun</td>
                                  <td width="1">
                                    <div tabindex="0" class="datePickerNextButton datePickerNextButton-up" role="button" aria-pressed="false">
                                      <input type="text" tabindex="-1" role="presentation" style="opacity: 0; height: 1px; width: 1px; z-index: -1; overflow: hidden; position: absolute;">
                                      <div class="html-face">»</div>
                                    </div>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                          </td>
                        </tr>
                        <tr>
                          <td align="left" style="vertical-align: top;">
                            <table cellpadding="0" cellspacing="0" border="0" class="datePickerDays">
                              <colgroup>
                              <col>
                              <col>
                              <col>
                              <col>
                              <col>
                              <col>
                              <col></colgroup>
                            <tbody>
                              <tr>
                                <td class="datePickerWeekdayLabel">M</td>
                                <td class="datePickerWeekdayLabel">T</td>
                                <td class="datePickerWeekdayLabel">W</td>
                                <td class="datePickerWeekdayLabel">T</td>
                                <td class="datePickerWeekdayLabel">F</td>
                                <td class="datePickerWeekendLabel">S</td>
                                <td class="datePickerWeekendLabel">S</td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">27</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">28</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">29</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">30</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">31</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">1</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">2</div>
                                </td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">3</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">4</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">5</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">6</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">7</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">8</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">9</div>
                                </td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">10</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay  datePickerDayIsToday  ">11</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsValue">12</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">13</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">14</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">15</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">16</div>
                                </td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">17</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">18</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">19</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">20</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">21</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">22</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">23</div>
                                </td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">24</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">25</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">26</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">27</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay ">28</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">29</div>
                                </td>
                                <td>
                                  <div tabindex="0" aria-selected="false" class="datePickerDay datePickerDayIsWeekend ">30</div>
                                </td>
                              </tr>
                              <tr>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">1</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">2</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">3</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">4</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsFiller ">5</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsWeekend datePickerDayIsFiller ">6</div>
                                </td>
                                <td>
                                  <div tabindex="-1" aria-selected="false" class="datePickerDay datePickerDayIsWeekend datePickerDayIsFiller ">7</div>
                                </td>
                              </tr>
                            </tbody>
                          </table>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
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
