package com.portal.salesportal.config;

import com.portal.salesportal.model.AdditionalAttributes;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "categoryattributemap")
@Data
public class CategoryAttributeMap {
    private Map<String, List<AdditionalAttributes>> map;
}
