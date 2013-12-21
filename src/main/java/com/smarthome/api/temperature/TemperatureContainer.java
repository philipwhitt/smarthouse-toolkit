package com.smarthome.api.temperature;

import com.smarthome.api.Container;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
@EqualsAndHashCode(callSuper=true)
public class TemperatureContainer extends Container {

    protected List<Temperature> content;

}
