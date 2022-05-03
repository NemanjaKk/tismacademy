package group.tismacademy.annotation;

import group.tismacademy.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryExistsValidator implements ConstraintValidator<CategoryExistsValidation, Integer> {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return categoryRepository.existsById(integer);
    }
}
