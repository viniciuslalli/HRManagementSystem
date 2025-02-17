package com.dgnklz.hrmanagementsystem.controller;

import com.dgnklz.hrmanagementsystem.business.abstracts.ContractService;
import com.dgnklz.hrmanagementsystem.business.dto.requests.contract.CreateContractRequest;
import com.dgnklz.hrmanagementsystem.business.dto.responses.contract.CreateContractResponse;
import com.dgnklz.hrmanagementsystem.business.dto.responses.contract.GetAllContractsResponse;
import com.dgnklz.hrmanagementsystem.core.result.DataResult;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
@AllArgsConstructor
public class ContractController {

    private ContractService service;
    @PostMapping("/add")
    public DataResult<CreateContractResponse> add(@Valid @RequestBody CreateContractRequest request){
        return service.add(request);

    }

    @GetMapping("getAll")
    public DataResult<List<GetAllContractsResponse>> getAll(){return service.getAll();}



}
