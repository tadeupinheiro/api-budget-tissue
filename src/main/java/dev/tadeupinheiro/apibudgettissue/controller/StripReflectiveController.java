package dev.tadeupinheiro.apibudgettissue.controller;

import dev.tadeupinheiro.apibudgettissue.dto.StripRecordDto;
import dev.tadeupinheiro.apibudgettissue.model.StripReflectiveConsumption;
import dev.tadeupinheiro.apibudgettissue.service.StripReflectiveConsumptionService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripreflective")
public class StripReflectiveController {

    @Autowired
    StripReflectiveConsumptionService stripReflectiveConsumptionService;

    @PostMapping
    public ResponseEntity saveStripReflectiveConsumption (@RequestBody @Valid StripRecordDto stripRecordDto){
        var stripReflectiveConsumption = new StripReflectiveConsumption();
        if (stripReflectiveConsumptionService.existsByIdStripReflective(stripRecordDto.idStripConfiguration())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("StripReflectiveConsumption already exists!");
        }
        BeanUtils.copyProperties(stripRecordDto, stripReflectiveConsumption);
        return ResponseEntity.status(HttpStatus.CREATED).body(stripReflectiveConsumptionService.saveStripReflectiveConsumption(stripReflectiveConsumption));
    }
}
