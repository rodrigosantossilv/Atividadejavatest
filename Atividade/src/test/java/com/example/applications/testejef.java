package com.example.applications;

import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class testejef {

    @InjectMocks
    ProductApplication applicacao;

    @Mock
    ProductService servico;

    @Test
    public void deveSalvarAimagemCorretamente() {
        Product produto = any(Product.class);
        applicacao.append(produto);
        Mockito.verify(servico, Mockito.times(1)).save(produto);
    }

    @Test
    public void deveRemoverAimagemCorretamente() {
        Product produto = any(Product.class);
        applicacao.remove(1);
        Mockito.verify(servico, Mockito.times(1)).remove(1);
    }

    @Test
    public void deveAtualizarAimagemCorretamente() {
        Product produto = any(Product.class);
        applicacao.update(1, produto);
        Mockito.verify(servico, Mockito.times(1)).update(produto);
    }
}