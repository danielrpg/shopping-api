DO $$
DECLARE
    i INTEGER := 0;
BEGIN
    WHILE i < 1000 LOOP
        INSERT INTO shopping.products (title, description, price, rating, stock, quantity, brand, category, thumbnail)
        VALUES (
            'Product ' || (i + 1),
            'Description of Product ' || (i + 1),
            (RANDOM() * 100 + 10)::numeric(10, 2),  -- Random price between 10 and 110
            (RANDOM() * 5)::numeric(10, 1),         -- Random rating between 0 and 5
            (RANDOM() * 200)::integer,             -- Random stock between 0 and 200
            (RANDOM() * 20)::integer,              -- Random quantity between 0 and 20
            'Brand ' || (1 + (i % 10)),            -- 10 brands in total
            'Category ' || (1 + (i % 5)),          -- 5 categories in total
            'thumbnail' || (i % 10) || '.jpg'
        );
        i := i + 1;
    END LOOP;
END $$;
