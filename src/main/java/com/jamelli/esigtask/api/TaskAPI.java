package com.jamelli.esigtask.api;
import java.util.List;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.jamelli.esigtask.services.TaskService;
import com.jamelli.esigtask.domains.Task;

@CrossOrigin(origins = "*")
@RequestMapping(value = "api/task")
@RestController
public class TaskAPI {
    @Autowired
    private TaskService service;

    @PostMapping
    public ResponseEntity<Void> save( @RequestBody Task task) {
        task = service.save(task);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(task.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<Task>> findAll() {
        List<Task> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
