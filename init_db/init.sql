DO $$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'barberservice') THEN
      EXECUTE 'CREATE DATABASE barberservice';
   END IF;
END
$$;