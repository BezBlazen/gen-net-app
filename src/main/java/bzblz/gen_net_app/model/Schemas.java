package bzblz.gen_net_app.model;

import bzblz.gen_net_app.dto.UriDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Defined enums, types")
public class Schemas {
    @Schema(description = "Gender Type Uri Dictionary")
    public List<UriDto> baseGenderTypeUri = GenderType.toUriDtoArray();

    @Schema(description = "Name Type Uri Dictionary")
    public List<UriDto> baseNameTypeUri = NameType.toUriDtoArray();

    @Schema(description = "Name Part Type Uri Dictionary")
    public List<UriDto> baseNamePartTypeUri = NamePartType.toUriDtoArray();

    @Schema(description = "Name Part Type Uri Enum",
            implementation = NamePartType.class,
            enumAsRef = true)
    public NamePartType baseNamePartTypeUriEnum;
}
