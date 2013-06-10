package com.kradcifer.sociofan.client.mvp.fans.addedit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.FormElement;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.kradcifer.sociofan.client.mvp.View;
import com.kradcifer.sociofan.shared.FanModality;

public class AddEditFanView extends Composite implements View {

	private static AddEditFanViewUiBinder uiBinder = GWT
			.create(AddEditFanViewUiBinder.class);

	interface AddEditFanViewUiBinder extends UiBinder<Widget, AddEditFanView> {
	}

	public AddEditFanView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		birth.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("dd/MM/yyyy")));
		
		maritalStatus.addItem("Selecione", "");
		maritalStatus.addItem("Casado(a)", "Casado(a)");
		maritalStatus.addItem("Solteiro(a)", "Solteiro(a)");
		maritalStatus.addItem("Divorciado(a) / Separado(a)", "Divorciado(a) / Separado(a)");
		
		rg.getElement().setAttribute("placeholder", "RG");
		cpf.getElement().setAttribute("placeholder", "CPF");
		
		fanName.getElement().setAttribute("placeholder", "Digite o nome do torcedor");
		fanName.getElement().setAttribute("id", "title-input");
		
		for (FanModality modality : FanModality.values()) {
			modalities.addItem(modality.label, modality.name());
		}
	}

	@UiField FormElement formElement;
	
	@UiField Button save;

	@UiField DateBox birth;
	@UiField RadioButton radioMale;
	@UiField TextBox fanName;
	@UiField ListBox modalities;
	@UiField TextBox email;
	@UiField TextBox residencialPhone;
	@UiField TextBox cellular;
	@UiField TextBox commercialPhone;
	@UiField ListBox maritalStatus;
	@UiField TextBox fathersName;
	@UiField TextBox mothersName;
	@UiField TextBox rg;
	@UiField TextBox cpf;
	@UiField TextBox job;

	@UiField TextBox address;
	@UiField TextBox comp;
	@UiField TextBox city;
	@UiField TextBox district;
	@UiField TextBox zip;
	
}
