package com.ecommerce.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.ecommerce.controller.ProductBean;
import com.ecommerce.model.Brand;

@FacesConverter(value = "brandConverter")
public class BrandConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String value) {
		if (value != null && value.trim().length() > 0) {

			try {
				ProductBean bean = new ProductBean();
				return bean.getBrandList().get(Integer.parseInt(value) - 1);

			} catch (NumberFormatException e) {
				throw new ConverterException(
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid brand name."));
			}

		} else {
			return null;
		}

	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object object) {
		if (object != null) {
			System.out.println(object);
			return String.valueOf(((Brand) object).getId());
		} else {
			return null;
		}
	}

}
