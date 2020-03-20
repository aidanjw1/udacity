using System;
using Microsoft.AspNetCore.Http;

namespace API.Helpers
{
    public static class Extensions
    {
        public static void AddApplicationError(this HttpResponse response, string message)
        {
            response.Headers.Add("Application-error", message);
            response.Headers.Add("Access-Control-Expose-Headers", "Application-Error");
            response.Headers.Add("Access-Control-Allow-Origin", "*");
        }

        public static int CalculateAge(this DateTime dateOfBirth) 
        {
            var age = DateTime.Today.Year - dateOfBirth.Year;
            if(dateOfBirth.AddYears(age) > DateTime.Today) 
            {
                age--;
            }
            return age;
        }
    }
}