package io.ramonak;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Route("months")
public class MonthsView extends Div {

    public MonthsView(@Autowired ClientService clientService) {
        List<String> months = clientService.getMonths();
        List<Month> gridItems = months.stream().map(s -> new Month(s)).collect(Collectors.toList());
        Grid<Month> grid = new Grid<>(Month.class);
        grid.setItems(gridItems);
        add(grid);
    }
}
