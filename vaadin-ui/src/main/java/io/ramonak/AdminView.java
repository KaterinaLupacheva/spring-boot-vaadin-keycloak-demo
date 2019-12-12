package io.ramonak;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("admin")
public class AdminView extends Div {

    public AdminView(@Autowired ClientService clientService) {
        String adminPage = clientService.getAdminPage();
        add(new H1(adminPage));
    }
}
