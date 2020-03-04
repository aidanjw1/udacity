using System.Threading.Tasks;
using API.Models;

namespace API.Data
{
    public interface IAuthRepository
    {
         Task<User> Register(User user, string password);
         Task<User> LogIn(string username, string password);
         Task<bool> UserExists(string username);
    }
}