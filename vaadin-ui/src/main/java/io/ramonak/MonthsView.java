package io.ramonak;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("months")
public class MonthsView extends Div {

    public MonthsView(@Autowired ClientService clientService) {
        List<String> months = clientService.getMonths();
        months.forEach(s -> add(new Paragraph(s)));
    }
}
