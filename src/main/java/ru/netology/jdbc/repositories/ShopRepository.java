package ru.netology.jdbc.repositories;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.netology.jdbc.utils.FileUtils;

import java.util.List;
import java.util.Map;

@Repository
@NoArgsConstructor
public class ShopRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private static final String SEARCH_PRODUCT_SCRIPT = FileUtils.read("select.sql");

    public List<String> getProductName(String name) {
        return namedParameterJdbcTemplate.query(SEARCH_PRODUCT_SCRIPT,
                Map.of("name", name),
                (rs, rowNum) -> rs.getString("product_name"));
    }


}
