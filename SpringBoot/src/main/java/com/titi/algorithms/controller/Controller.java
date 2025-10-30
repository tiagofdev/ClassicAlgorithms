package com.titi.algorithms.controller;

import com.titi.algorithms.model.Response;
import com.titi.algorithms.repo.implementation.Implementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping( "/")
@RequiredArgsConstructor
public class Controller {
    // Controller also usually called resource in webapp development
    private final Implementation algorithm;

    @GetMapping("/twosum/{inputArray}+{inputTarget}")
    public ResponseEntity<Response> twoSum(@PathVariable("inputArray") int[] array,
                                           @PathVariable("inputTarget") int target) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .status(OK)
                        .statusCode(OK.value())
                        .message("Result retrieved from server.")
                        .data(Map.of("results",algorithm.twoSum(array,target)))
                        .build()
        );
    }

    @GetMapping("/knapsack/{inputValues}+{inputWeights}+{inputMaximum}")
    public ResponseEntity<Response> knapsack(@PathVariable("inputValues") int[] inputValues,
                                             @PathVariable("inputWeights") int[] inputWeights,
                                             @PathVariable("inputMaximum") int inputMaximum) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .status(OK)
                        .statusCode(OK.value())
                        .message("Result retrieved from server.")
                        .data(Map.of("results",algorithm.knapsack(inputValues,inputWeights,inputMaximum)))
                        .build()
        );
    }

    @GetMapping("/quicksort/{inputArray}")
    public ResponseEntity<Response> quicksort(@PathVariable("inputArray") int[] inputArray) {
        System.out.println("received quick sort");
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .status(OK)
                        .statusCode(OK.value())
                        .message("Result retrieved from server.")
                        .data(Map.of("results",algorithm.quicksort(inputArray)))
                        .build()
        );
    }

    @GetMapping("/dijkstras/{inputEdges}+{inputSource}")
    public ResponseEntity<Response> dijkstras(@PathVariable("inputEdges") String inputEdges,
                                              @PathVariable("inputSource") String inputSource) {
        System.out.println("received dijkstras");
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .status(OK)
                        .statusCode(OK.value())
                        .message("Result retrieved from server.")
                        .data(Map.of("results",algorithm.dijkstras(inputEdges, inputSource)))
                        .build()
        );
    }

    @GetMapping("/dfs/{inputEdges}+{inputSource}")
    public ResponseEntity<Response> dfs(@PathVariable("inputEdges") String inputEdges,
                                        @PathVariable("inputSource") String inputSource) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .status(OK)
                        .statusCode(OK.value())
                        .message("Result retrieved from server.")
                        .data(Map.of("results",algorithm.dfs(inputEdges, inputSource)))
                        .build()
        );
    }

    @GetMapping("/kmp/{inputPattern}+{inputString}")
    public ResponseEntity<Response> kmp(@PathVariable("inputPattern") String inputPattern,
                                        @PathVariable("inputString") String inputString) {
        System.out.println("received kmp");
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("results",algorithm.kmp(inputPattern, inputString)))
                        .message("Result retrieved from server.")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/coin-change/{inputCoins}+{inputChange}")
    public ResponseEntity<Response> coinChange(@PathVariable("inputCoins") int[] inputCoins,
                                               @PathVariable("inputChange") int inputChange) {
        System.out.println("received coin change");
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("results",algorithm.coinChange(inputCoins, inputChange)))
                        .message("Result retrieved from server.")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/job-sequencing/{inputJobs}+{inputDeadline}")
    public ResponseEntity<Response> jobSequencing(@PathVariable("inputJobs") String inputJobs,
                                          @PathVariable("inputDeadline") int inputDeadline) {
        System.out.println("received job sequencing");
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("results",algorithm.jobSequencing(inputJobs,inputDeadline)))
                        .message("Result retrieved from server.")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/graph-coloring/{inputEdges}")
    public ResponseEntity<Response> graphColoring(@PathVariable("inputEdges") String inputEdges) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("results",algorithm.graphColoring(inputEdges)))
                        .message("Result retrieved from server.")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

}
