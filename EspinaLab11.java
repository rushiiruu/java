class EspinaLab11
{
        private int temperature = 15;
        
        int getTemperature()
        {
            return temperature;
        }

        public void warmer()
        {
            temperature = temperature + 5;
        }

        public void cooler()
        {
            temperature = temperature - 5;
        }
}